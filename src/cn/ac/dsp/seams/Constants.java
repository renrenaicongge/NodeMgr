package cn.ac.dsp.seams;

import java.io.File;

/**
 * @version 1.0
 */

public final class Constants {
	
	public static final String charset="utf-8";

	public static String TMP_DIRECTORY = "temp/";
	
	public static int MAX_ROUTESTEP = 255;
	
	public static int MAX_DELAY = 65535;
	
	public static int MAX_HOP = 127;
	
	public static final int NEIGHBORHOOD_MIN = 24; 
	
	static {
		String catalinaHome = System.getenv("catalina.home");
		if (catalinaHome != null) {
			if (catalinaHome.endsWith("/")) {
				TMP_DIRECTORY = System.getenv("catalina.home") + "temp/";
			} else {
				TMP_DIRECTORY = System.getenv("catalina.home") + "/temp/";
			}
		}

		File dir = new File(Constants.TMP_DIRECTORY);
		if (!dir.exists()) {
			dir.mkdir();
		}
	}

	/**
	 * 所有REST接口的协议版本号.
	 */
	public static final String VERSION_INTERFACE_PROTOCOL = "1.0";

	public static class RoleCode{
		public static int ROLE_CODE_ADMINISTRATOR = 1001;
		public static int ROLE_CODE_ANALYST = 1002;
		public static int ROLE_CODE_TOOL_SUPPORTOR = 1004;
	}

	public class Session {
		public static final String ACCOUNT_ATTRIBUTE_NAME = "account";
		public static final String PERMISSION_SET_ATTRIBUTE_NAME = "permissionSet";
		public static final String ALL_PERMISSIONS_ATTRIBUTE_NAME = "ALL_PERMISSIONS_NAME";

		public static final String CONTROL_MENU = "controlMenu";
		public static final String USER_MENU = "userMenu";

		public static final String PROVINCE_LIST = "provinceList";
		public static final String CITY_LIST = "cityList";
		public static final String COUNTY_LIST = "countyList";

		public static final String TOP_USERNAME = "topUsername";
	}

	public static final int SUPER_ROLE_ID = 100000;
	public static final String INIT_ROLE_ID = "Role------0000000000000-00-00001";

	/**
	 * 下拉框默认城市
	 */
	public static final String CAPITAL_PROVINCE = "北京";
	public static final String CAPITAL_CITY = "北京市";

	public enum AccountState {
		UNDER_VERIFY(100010, "待审核"), ACTIVE(100020, "激活"), INVALID(100030, "失效");
		private int code;
		private String name;

		private AccountState(int code, String name) {
			this.code = code;
			this.name = name;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static class NodeConstants{
		
		public static final int NODE_TYPE_TARGET = 0;
		public static final int NODE_TYPE_NEIGHBOUR = 1;
		
		public static final int NODE_TYPE_PORTAL = 1;
		public static final int NODE_TYPE_MEASURE = 2;
		
		public static final int NODE_STATUS_OFFLINE = 0;
		public static final int NODE_STATUS_ONLINE = 1;
		public static final int NODE_STATUS_QUIT = 2;
		
		public static class EdgeNodeIdConstants{
			public static final int EDGE_NODE_ID_STATUS_UNUSED = 0; //边缘节点标识未使用
			public static final int EDGE_NODE_ID_STATUS_USED = 1; //边缘节点标识已使用
			
			public static String getStatusDesc(int status){
				String desc = "未知状态";
				switch(status){
					case EDGE_NODE_ID_STATUS_UNUSED: 
						desc = "未使用";
						break;
					case EDGE_NODE_ID_STATUS_USED:
						desc = "已使用";
						break;
					default:
						break;
				}
				return desc;
			}
		}
		
		public static class RnodePositionConstants{
			public final static int POSITION_NEW_JOIN = 0; //新加入
			
			public final static int POSITION_TO_JOIN = 5; //待加入
			
			public final static int POSITION_LOCATING = 10; //加入到树过程中
			
			public final static int POSITION_LOCATED = 20; //加入完成
			
			
			public static String getStatusStr(int status){
				
				String result = "";
				switch(status){
					case POSITION_NEW_JOIN:
						result = "新加入";
						break;
					
					case POSITION_TO_JOIN:
						result = "待加入";
						break;
					
					case POSITION_LOCATING:
						result = "加入树过程中";
						break;
					
					case POSITION_LOCATED:
						result = "已加入拓扑树";
						break;
						
					default:
						break;
				}
				
				return result;
			}
			
		}
		
		
		
		public static class NodeStatusConstants{
			public final static int STATUS_NORMAL = 10; //正常工作
			public final static int STATUS_OFFLINE = 20; //离线
			
			public static String getStatusString(int status){
				
				String result = "";
				switch(status){
					case STATUS_NORMAL:
						result = "正常在线";
						break;
					
					case STATUS_OFFLINE:
						result = "离线";
						break;
					default:
						break;
				}
				
				return result;
			}
			
		}
		
	}
	
	public static final class UDPPackageConstants {
		public final static byte[] MAGIC_NUMS = {0x0B, 0x0A, 0x0B, 0x0E};
		public final static int HEAD_LEN = 7;
	}
	
	public static final class SignalConstants{
		
		public final static byte SIGNAL_TAG_NODE_ONLIE = 0x01; //节点上线
		
		public final static byte SIGNAL_TAG_NODE_HEARTBEAT = 0x02; //心跳
		
		public final static byte SIGNAL_TAG_NODE_NEIGHBORQUERY = 0x09;//邻居查询
		
		public final static byte SIGNAL_TAG_NODE_UPDATE = 0x05;//升级请求
		
		public final static byte SIGNAL_TAG_NODE_HITRATE_REPORT = 0x06;//命中率上报
		
		public final static byte SIGNAL_TAG_NODE_CACHEDFILE_REPORT = 0x07;//CachedFile上报
		
		public final static byte SIGNAL_TAG_NODE_ONDEMAND_REPORT = 0x08;//点播行为上报
		
		public final static byte SIGNAL_TAG_NODE_MEASURE_DIS = 0x20; //节点测距
		
		public final static byte SIGNAL_TAG_NODE_ADDRESSING = 0x70; //寻址
		
		public final static byte SIGNAL_TAG_NODE_CACHE_REPORT = 0x03; //缓存结果上报
		
		public final static byte SIGNAL_TAG_NODE_NEIGHBORREPORT = 0x11; //节点邻居上报
		
		public final static byte SIGNAL_TAG_IPK_UPDATE = 0x0A;//ipk升级请求
		
		public final static byte SIGNAL_TAG_IPK_UPDATE_REPORT = 0x0B;//ipk升级结果上报
		
		public final static byte SIGNAL_TAG_DEBUG_DATA_UPLOAD = 0x0C;//路由节点调试数据上报
		
	}
	
	
	
	public static final class MinaSessionConstants{
		public final static String SESSION_ATTR_KEY_CLIENT_IP = "ATTR_KEY_CLIENT_IP";
		public final static String SESSION_ATTR_KEY_CLIENT_PORT = "ATTR_KEY_CLIENT_PORT";
	}
	
	public static final class SysConfigConstants{
		
		public final static String CONFIG_NAME_NODE_MGR_SERVICE_ADDR = "NODE_MGR_SERVICE_ADDR";
		public final static String CONFIG_NAME_NODE_MGR_SERVICE_ADDR_LOCAL = "NODE_MGR_SERVICE_ADDR_LOCAL";
		public final static String CONFIG_NAME_DATA_COLLECT_SERVICE_ADDR = "DATA_COLLECT_SERVICE_ADDR";
		public final static String CONFIG_NAME_LOG_SERVICE_ADDR = "LOG_SERVICE_ADDR";
		public final static String CONFIG_NAME_MAP_KEY = "MAP_KEY";
		public final static String CONFIG_NAME_CMS_API_URL = "CMS_API_URL";
		public final static String CONFIG_NAME_SOFT_VER = "SOFT_VERSION";
		public final static String CONFIG_NAME_SOFT_MD5 = "SOFT_MD5";
		public final static String CONFIG_NAME_SOFT_URL = "SOFT_URL";
		public final static String CONFIG_NAME_SOFT_BK_URL = "SOFT_BK_URL";
		public final static String CONFIG_NAME_UPDATE_PACKAGE_DIR = "UPDATE_PACKAGE_DIR";
		public static final String CONFIG_NAME_SOFT_PACKAGE_SIZE = "UPDATE_PACKAGE_SIZE";
		public static final String CONFIG_NAME_SOFT_UPDATE_CHANGE_LOG = "UPDATE_CHANGE_LOG";
		public static final String CONFIG_NAME_CMS_ROOT_URL = "CMS_ROOT_URL";
		public static final String CONFIG_NAME_IP_PARSE_URL ="IP_PARSE_URL";
		public static final String DEFAULT_EDGENODE_ID ="DEFAULT_EDGENODE_ID";
		public static final String PER_SENDNEIGHBOR_LIMIT ="PER_SENDNEIGHBOR_LIMIT";
		public static final String CONFIG_NAME_UPDATE_SERVER_PORT = "UPDATE_SERVER_PORT";
		public static final String CONFIG_SUBNET_MASK = "SUBNET_MASK";
		public static final String LAN_EDGENODE_ID = "LAN_EDGENODE_ID";
		
	}
	
	public static final class ACTIVE_MQ_NAMES{
		public final static String ONDEMAND_QUEUE_NAME = "ONDEMAND_QUEUE";
	}
}
