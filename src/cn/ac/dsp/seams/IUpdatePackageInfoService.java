package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.UpdatePackageInfo;

public interface IUpdatePackageInfoService {
	
	public boolean saveInfo(UpdatePackageInfo updatePackageInfo);
	
	public boolean updateInfoById(String id, String changeLog);

	public List<UpdatePackageInfo> getAll();
	
	public boolean checkPackageVersionExist(String name, String version);
	
	public UpdatePackageInfo selectById(String id);
	
	public boolean deleteById(String id);
}
