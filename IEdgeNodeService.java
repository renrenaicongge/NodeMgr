package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.EdgeNode;

/**
 *@author xukc@dsp.ac.cn
 */
public interface IEdgeNodeService {
	
	public boolean addEdgeNode(EdgeNode node);
	
	public EdgeNode getEdgeNode(String id);
	
	public boolean updateEdgeNode(EdgeNode node);
	
	public List<EdgeNode> findAll();
	
	public EdgeNode getEdgeNodesByProvinceAndIsp(String province,String isp);
	
	public EdgeNode getEdgeNodesByProvince(String province);
	
	public boolean isExist(String id);

	public boolean addNodeNumToEdgeNode(EdgeNode targetEdgeNode);

}
