package com.globalpay.test;

import static org.junit.Assert.fail;

import java.net.SocketException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.globalpay.ws.ca.dao.B24interface;
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

import csl.globalpay.ipm.msgprdf5reply.MsgPRDF5Reply;

public class B24CAReadTest {

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

		B24interface b24 = new B24interface();
		try {
			MsgPRDF5Reply prdfReply = b24.readRetailer("5760877", "5760877");
			
		} catch (SocketException | RetailerNotFoundException
				| NoBufferSpaceException | NoCBSpaceException
				| NoIOCBSpaceException | NoIOBufSpaceException
				| NoIOPhysMemException | NoPoolSpaceException
				| StatusTimeoutException | RetailerFileException
				| NoPhysMemException | ConnectionFailedException
				| ConnectionFileInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Ignore
	public void testGetRecords() {
		fail("Not yet implemented");
	}

}
