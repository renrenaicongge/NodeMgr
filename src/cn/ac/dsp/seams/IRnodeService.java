package cn.ac.dsp.seams;

import java.util.List;

import cn.ac.dsp.seams.domain.Rnode;
import cn.ac.dsp.seams.dto.RnodeDTO;

/**
 *@author xukc@dsp.ac.cn
 */
public interface IRnodeService {
	
	/**
	 * 添加节点
	 * @param node
	 * @return
	 */
	public boolean addRnode(Rnode node);
	
	
	/**
	 * 删除节点
	 * @param node
	 * @return
	 */
	public boolean deleteRnode(Rnode node);
	
	/**
	 * 获取节点
	 * @param id
	 * @return
	 */
	public Rnode getRnode(String id);
	
	/**
	 * 更新节点
	 * @param node
	 * @return
	 */
	public boolean updateRnode(Rnode node);
	

	/**
	 * 节点是否存在，存在返回true
	 * @param id
	 * @return
	 */
	public boolean isExist(String id);
	
	/**
	 * 查找儿子节点
	 * @param id
	 * @return
	 */
	public List<Rnode> findChildren(String id);
	
	/**
	 * 递归获取当前节点下全部的子节点
	 * @param node
	 * @return
	 */
	public List<Rnode> getchildNodes(Rnode node);
	
	/**
	 * 查找当前节点下在线的大度子节点（深度优先）,加入到list中
	 * @param list
	 * @param node
	 */
	public void getonlineBigdegreeChildNode(List<Rnode> list,Rnode node);
	
	/**
	 * 查找在线的儿子节点
	 * @param id
	 * @return
	 */
	public List<Rnode> findonlineChildren(String id);
	

	
	/**
	 * 查找儿子节点，且儿子节点id不为selfId
	 * @param id
	 * @param selfId
	 * @return
	 */
	public List<Rnode> findChildrenExceptSelf(String id, String selfId);
	
	
	/**
	 * 查找加入时间在jointime之前的儿子节点，且儿子节点id不为selfId
	 * @param id
	 * @param selfId
	 * @param jointime
	 * @return
	 */
	public List<Rnode> findChildrenExceptSelfEarlier(String id, String selfId,long jointime);
	
	/**
	 * 查找加入时间在jointime之前的在线的儿子节点，且儿子节点id不为selfId
	 * @param id
	 * @param selfId
	 * @param jointime
	 * @return
	 */
	public List<Rnode> findonlineChildrenExceptSelfEarlier(String id, String selfId,long jointime);
	
	
	/**
	 * 查找父节点
	 * @param id
	 * @return
	 */
	public Rnode findParent(String id);
	
	/**
	 * 获取总数
	 * @return
	 */
	public int getTotalCount();
	
	/**
	 * 区间查找
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Rnode> findRnodesWithLimit(int start, int size);
	
	/**
	 * 查询所属边缘节点下的路由节点数目
	 * @param edgeNodeId
	 * @return
	 */
	public int getTotalCount(String edgeNodeId);
	
	/**
	 * 查询所属边缘节点下的路由节点列表
	 * @param edgeNodeId
	 * @return
	 */
	public List<Rnode> getTotalRNodeList(String edgeNodeId);
	
	/**
	 * 置没有心跳的路由器节点状态为离线
	 * @return
	 */
	public boolean offlineRnodeWithoutHeartbeat(int duration);
	
	
	/**
	 * 置没有心跳的路由器节点状态为离线
	 * @param nodeId
	 * @return
	 */
	public boolean offlineRnodeWithoutHeartbeat(String nodeId);
	
	/**
	 * 置有心跳的路由器节点状态为在线
	 * @param nodeId
	 * @return
	 */
	public boolean onlineRnodeWithHeartbeat(String nodeId);
	
	/**
	 * 查找所有
	 * @return
	 */
	public List<Rnode> findAllRnodes();
	
	/**
	 * 查找节点的邻居节点
	 */
	public List<Rnode> findneighborList(Rnode rnode);
	
	
	/**
	 * 查找所有节点和对应的邻居节点
	 * @return
	 */
	public List<RnodeDTO> findAllRnodesAndnbNodes();
	
	/**
	 * 查找所有在线
	 * @return
	 */
	public List<Rnode> findAllOnlineRnodes();
	
	
	/**
	 * 查找所有离线
	 * @return
	 */
	public List<Rnode> findAllOfflineRnodes();
	
	/**
	 * 查询在线路由节点数目
	 * @return
	 */
	public int getTotalCountOnline();
	
	/**
	 * 查询某一边缘下的在线路由节点数目
	 * @return
	 */
	public int getTotalCountOnline(String edgeId);
	/**
	 * 返回list中的加入树的子集
	 */
	public List<String> getHavepositioned(List<String> list);


	public List<Rnode> getRNodeListByEdgeList(String[] edgeIdList);
}
