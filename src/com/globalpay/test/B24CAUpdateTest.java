package com.globalpay.test;

import static org.junit.Assert.fail;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.globalpay.ws.ca.beans.Address;
import com.globalpay.ws.ca.beans.MerchantInfo;
import com.globalpay.ws.ca.beans.Name;
import com.globalpay.ws.ca.beans.PhoneNumber;
import com.globalpay.ws.ca.beans.UpdateMerchantInfo;
import com.globalpay.ws.ca.dto.MerchantInfoDTO;
import com.globalpay.ws.ca.dto.StatusDetailsDTO;
import com.globalpay.ws.ca.exception.ConnectionFailedException;
import com.globalpay.ws.ca.exception.ConnectionFileInvalidException;
import com.globalpay.ws.ca.exception.NoBufferSpaceException;
import com.globalpay.ws.ca.exception.NoCBSpaceException;
import com.globalpay.ws.ca.exception.NoIOBufSpaceException;
import com.globalpay.ws.ca.exception.NoIOCBSpaceException;
import com.globalpay.ws.ca.exception.NoIOPhysMemException;
import com.globalpay.ws.ca.exception.NoPhysMemException;
import com.globalpay.ws.ca.exception.NoPoolSpaceException;
import com.globalpay.ws.ca.exception.RetailerFileException;
import com.globalpay.ws.ca.exception.RetailerNotFoundException;
import com.globalpay.ws.ca.exception.StatusTimeoutException;
import com.globalpay.ws.ca.service.GNAPService;
import com.globalpay.ws.ca.util.Constant;
import com.globalpay.ws.ca.util.Utility;

public class B24CAUpdateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessRecords() {
		// Base24Service b24 = new Base24Service();

		com.globalpay.ws.ca.beans.UpdateMerchantInfo updateMerchantInfo = new UpdateMerchantInfo();
		updateMerchantInfo.setRequestId("123456");
		updateMerchantInfo.setUserId("456789");
		// updateMerchantInfo.setCorrelationId("789456");
		PhoneNumber phnNo = new PhoneNumber();
		phnNo.setPhoneNumber("00121");
		phnNo.setFieldType(Constant.DBA_PHONE_NUMBER.getConstantValue());
		Address add = new Address();
		// add.setAddress1("1004");
		// add.setAddress2("Baner");
		// add.setCity("Pune");
		// add.setCountry("123546");
		add.setFieldType(Constant.DBA_ADDRESS.getConstantValue());
		Name name = new Name();
		name.setName("Stephen");
		name.setFieldType(Constant.DBA_NAME.getConstantValue());
		List<Address> addList = new ArrayList<>();
		List<PhoneNumber> phnList = new ArrayList<>();
		List<Name> nameList = new ArrayList<>();
		phnList.add(phnNo);
		addList.add(add);
		nameList.add(name);
		MerchantInfo info = new MerchantInfo();
		info.setMerchantId("5760877");
		info.setAddresses(addList);
		info.setNames(nameList);
		info.setPhoneNumbers(phnList);

		updateMerchantInfo.setMerchantInfo(info);
		GNAPService ser = new GNAPService();
		MerchantInfoDTO merchantDTO = Utility.mapDTO(updateMerchantInfo);

		try {
			StatusDetailsDTO status = ser.updateMerchantInfo(merchantDTO);
			System.out.println("ERROR CODE " + status.getCode());
			System.out.println("*****DESCRIPTION*****"
					+ status.getDescription());
			System.out.println("Connection success full****");
		} catch (SocketException | ConnectionFailedException
				| RetailerNotFoundException | ConnectionFileInvalidException
				| NoBufferSpaceException | NoCBSpaceException
				| NoIOBufSpaceException | NoIOCBSpaceException
				| NoIOPhysMemException | NoPhysMemException
				| NoPoolSpaceException | StatusTimeoutException
				| RetailerFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Ignore
	public void testGetRecords() {
		fail("Not yet implemented");
	}

}
