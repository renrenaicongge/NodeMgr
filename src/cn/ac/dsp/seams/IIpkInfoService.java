package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.IpkInfo;

public interface IIpkInfoService {

	public  boolean saveInfo(IpkInfo ipkInfo);
	
	public boolean updateInfoById(String id, String changeLog);

	public List<IpkInfo> getAll();
	
	public boolean checkIpkVersionExist(String name, String version);
	
	public boolean checkIpkVersionExist(String name);
	
	public IpkInfo selectById(String id);
	
	public IpkInfo selectByipkId(String ipkid);
	
	public IpkInfo selectByIpkFileName(String ipkfilename);
	
	public boolean deleteById(String id);
}
