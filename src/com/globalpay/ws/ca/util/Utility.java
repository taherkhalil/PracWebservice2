package com.globalpay.ws.ca.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.LoggerFactory;

import com.globalpay.ws.ca.beans.UpdateMerchantInfo;
import com.globalpay.ws.ca.dto.MerchantInfoDTO;
import com.globalpay.ws.ca.exception.MandatoryFieldNotFoundException;
import com.globalpay.ws.ca.generatedb24classes.B24RECORDS;
import com.globalpay.ws.ca.pojo.MossOrderDetail;
import com.globalpay.ws.ca.pojo.Operation;
import com.globalpay.ws.ca.pojo.OrderTypes;

// "/home/chouhapr/workspace/NucluesPOC/WebContent/WEB-INF/XMLConfig/B24Request.xml"
public class Utility {
	final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(Utility.class);

	@SuppressWarnings("unchecked")
	public static <T> T parseRecord(InputStream b24XML, Class<T> t) {

		T records = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(t);
			
			// Start - VERACODE scan fix for Improper Restriction of XML External Entity Reference ('XXE') (CWE ID 611)(1 flaw)
			XMLInputFactory xif = XMLInputFactory.newFactory();
			xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,false);
			xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xsr = null;
			xsr = xif.createXMLStreamReader(b24XML);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			records = (T) jaxbUnmarshaller.unmarshal(xsr);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		logger.debug("Utility.parseRecord completed");
		// End - VERACODE scan fix for Improper Restriction of XML External Entity Reference ('XXE') (CWE ID 611)(1 flaw)
		
		
		
		return records;

	}

	public static MerchantInfoDTO mapDTO(UpdateMerchantInfo updateMerchantInfo) {
		logger.debug("Utility.mapDTO");
		MerchantInfoDTO merchantDTO = ObjectMapper.map(
				updateMerchantInfo.getMerchantInfo(), MerchantInfoDTO.class);

		return merchantDTO;
	}

	public static String validateRetailer(String retailerId)
			throws MandatoryFieldNotFoundException {
		logger.debug("Utility.validateRetailer");
		String validatedRetailer = retailerId;

		if (retailerId == null || retailerId.trim().length() == 0) {
			throw new MandatoryFieldNotFoundException(
					"Mandatory Fields : retailer Id not found in request object");
		}
		return validatedRetailer.trim();
	}

	public static List<MossOrderDetail> createList(String mossOrderRef,
			B24RECORDS records) {

		List<MossOrderDetail> mossOrderDetailList = new ArrayList<MossOrderDetail>();

		String PRDFAction = records.getPRDFRECORD().getACTION();

		if (PRDFAction != null
				&& PRDFAction.length() > 0
				&& !PRDFAction.trim().equalsIgnoreCase(
						Operation.OPCODE_NONE.getOperation())) {

			MossOrderDetail orderDetail = new MossOrderDetail();
			orderDetail.setAction(PRDFAction);
			orderDetail.setTemplate(records.getPRDFRECORD().getTEMPLATE());
			// XPathNavigator outerXml
			orderDetail.setB24Data("");
			orderDetail.setOrderType(OrderTypes.ORDERTYPE_PRDF.getOrderType());
			orderDetail.setOrderRefNo(mossOrderRef);

			if (PRDFAction.trim().equalsIgnoreCase(
					Operation.OPCODE_UPDATE.getOperation())) {

				orderDetail.setTemplateFIID(String.valueOf(
						records.getPRDFRECORD().getPRDFRECIMAGE().getRKEY()
								.getFIID()).trim());
				orderDetail.setTemplateRID(String.valueOf(
						records.getPRDFRECORD().getPRDFRECIMAGE().getRKEY()
								.getRETAILERID()).trim());

			}
			orderDetail.setTemplateFIID(String.valueOf(
					records.getPRDFRECORD().getPRDFRECIMAGE().getRKEY()
							.getFIID()).trim());
			orderDetail.setKeyID(String.valueOf(
					records.getPRDFRECORD().getPRDFRECIMAGE().getRKEY()
							.getRETAILERID()).trim());

			orderDetail.setCreateDate(new Date());
			orderDetail.setUpdateDate(new Date());

			mossOrderDetailList.add(orderDetail);
		}

		String PTDFAction = records.getPTDFRECORD().getACTION();

		if (PTDFAction != null
				&& PTDFAction.length() > 0
				&& !PTDFAction.trim().equalsIgnoreCase(
						Operation.OPCODE_NONE.getOperation())) {

			MossOrderDetail orderDetail = new MossOrderDetail();
			orderDetail.setAction(PTDFAction);
			orderDetail.setTemplate(records.getPTDFRECORD().getTEMPLATE());
			// XPathNavigator outerXml
			orderDetail.setB24Data("");
			orderDetail.setOrderType(OrderTypes.ORDERTYPE_PTDF.getOrderType());
			orderDetail.setOrderRefNo(mossOrderRef);

			orderDetail.setKeyID(String.valueOf(records.getPTDFRECORD()
					.getPTDFRECIMAGE().getPTDFDEF().getTERMID().trim()));

			if (PTDFAction.trim().equalsIgnoreCase(
					Operation.OPCODE_UPDATE.getOperation())) {

				orderDetail.setTemplateTID(String.valueOf(
						records.getPTDFRECORD().getPTDFRECIMAGE().getPTDFDEF()
								.getTERMID()).trim());
			}

			orderDetail.setCreateDate(new Date());
			orderDetail.setUpdateDate(new Date());

			mossOrderDetailList.add(orderDetail);
		}

		return mossOrderDetailList;

	}

	public static void getRecords() {
		B24RECORDS records = null;

	}

	public static String validateString(String str) {
		logger.debug("Utility.validateString");
		if (str != null && str.trim().length() > 0) {
			return str.trim();
		}
		return "";
	}

	public static boolean isNotNullOrEmpty(String str) {
		logger.debug("Utility.isNotNullOrEmpty");
		if (str != null && str.trim().length() > 0) {
			return true;
		}
		return false;
	}

}
