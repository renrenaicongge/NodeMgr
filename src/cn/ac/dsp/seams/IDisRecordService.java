package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.DisRecord;

/**
 * 网络测距记录service
 *@author xukc@dsp.ac.cn
 */
public interface IDisRecordService {
	
	public boolean addDisRecord(DisRecord dr);
	
	public List<DisRecord> batchInSert(List<DisRecord> list);
	
	public DisRecord getDisRecord(String id);
	
	public DisRecord getDisRecord(String fromNodeId, String toNodeId);
	
	public List<DisRecord> getDisRecordsByFromNodeIdAfterATimeStamp(String fromNodeId, long timeStamp);
	
	public List<DisRecord> getAllDisRecordsByFromNodeId(String fromNodeId);
	
	public boolean updateDisRecord(DisRecord dr);
	
	public boolean deleteDisRecord(String fromNodeId);
	
	public boolean deleteDisRecord(String fromNodeId,String toNodeId);
	

}
