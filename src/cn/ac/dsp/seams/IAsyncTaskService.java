package cn.ac.dsp.seams;

import org.apache.mina.core.session.IoSession;

import cn.ac.dsp.seams.domain.Rnode;
import cn.ac.dsp.seams.udp.signalparser.parameter.NodeOnlineParameter;

/**
 *@author xukc@dsp.ac.cn
 */
public interface IAsyncTaskService {
	
	/**
	 * just for test
	 * @return 
	 */
	public String test();
	
	// 发送邻居节点列表同样需要异步处理
	public void sendNeighbourNodeLst(Rnode node,IoSession session);
	
	// 边缘节点上线需要异步处理
	public void edgeNodeOnline(NodeOnlineParameter node);
	
	// 加入树并发送邻居列表
	public void joinTreeAndSendNeighbourNodeLst(Rnode node, IoSession session);

	public void testAsync();

}
