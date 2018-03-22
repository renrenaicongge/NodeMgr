package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.SysConfigure;

/**
 * 
 * @author xukc
 *
 */
public interface ISysConfigureService {
	
	public static final class CONFIGURES{
		public static final String NGX_SERVER_DIR = "NGX_SERVER_DIR";
		public static final String CAPTION_FILE_DIR = "CAPTION_FILE_DIR";
		public static final String CMS_SEND_seamsRESULT_URL = "CMS_SEND_seamsRESULT_URL";
	}
	
	
	public void init();
	
	public SysConfigure getSysConfigureById(String id);
	public String getSysConfigureValueById(String id);	
	public boolean updateSysConfigure(String id,String value);	
	public boolean updateSysConfigure(String id,String name, String value);	
	public int getTotalCount();
	public List<SysConfigure> getSysConfigureList();

}
