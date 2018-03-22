package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.EdgeNodeId;

/**
 *@author xukc@dsp.ac.cn
 */
public interface IEdgeNodeIdService {

	/**
	 * 增加边缘节点标识
	 * @param id
	 * @return
	 */
	public boolean addEdgeNodeId(EdgeNodeId id);
	
	/**
	 * 获取边缘节点标识列表
	 * @return
	 */
	public List<EdgeNodeId> findAll();
	
	/**
	 * 删除边缘节点标识
	 * @param id
	 * @return
	 */
	public boolean deleteEdgeNodeId(EdgeNodeId id);
	
	/**
	 * 更新边缘节点标识
	 * @param id
	 * @return
	 */
	public boolean updateEdgeNodeId(EdgeNodeId id);
	
	/**根据id查找边缘节点标识
	 * @param id
	 * @return
	 */
	public EdgeNodeId getEdgeNodeId(String id);
	
	/**
	 * 将边缘节点标识ID的状态改变为used
	 * @param id
	 * @return
	 */
	public boolean changeEdgeNodeUdUsed(String id);
	
}
