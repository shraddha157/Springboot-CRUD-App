package com.tcs.Case.Study.exception;

import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.Map;

import javax.management.ObjectName;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class NoResultFound implements RuntimeMXBean {

	@Override
	public ObjectName getObjectName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVmVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSpecVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManagementSpecVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClassPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLibraryPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBootClassPathSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBootClassPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getInputArguments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getUptime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getStartTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, String> getSystemProperties() {
		// TODO Auto-generated method stub
		return null;
	}

}
