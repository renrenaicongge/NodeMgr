package cn.ac.dsp.seams;

import org.apache.mina.core.session.IoSession;

import cn.ac.dsp.seams.domain.Rnode;
import cn.ac.dsp.seams.udp.signalparser.parameter.NodeOnlineParameter;

public interface INodeStatusService {

	/**
	 * 节点上线接口，不区分路由器还是边缘
	 * @param node
	 * @param session
	 * @return
	 */
	public byte[] nodeOnlineInterface(NodeOnlineParameter node,IoSession session);
	/**
	 * 路由器节点下线
	 * @param rnode
	 */
	public void nodeOffline(Rnode rnode);
}
