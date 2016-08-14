v1/GET/order/insert_order
	功能：提交订单
	参数：	驾驶员姓名		出生日期		电话			取车日期	还车日期	取车地点		还车地点		付款方式	付款金额	所属公司	车辆名称	包含服务	是否已付款	头像图片	用户名	
	参数名称：	drivername	birthday	telephone	takeday	backday	takeplace	backplace	payway	price	company	carname	service	isPay	photo	username	
	参数案例：drivername=wangxin&birthday=2016-08-14&telephone=1780929777&takeday=2016-08-14&backday=2016-08-14&takeplace=洛杉矶&backplace=洛杉矶&payway=支付宝&price=10000&company=爱薇诗&carname=兰博基尼&service=司导&isPay=1&username=rain
	参数说明：ispay的参数0代表未付款，1代表已付款
	返回值：无
	
	
v1/POST/order/orders
	功能：显示订单
	参数：用户名	
	参数名称：username
	返回值：
		参数：	驾驶员姓名		出生日期		电话			取车日期	还车日期	取车地点		还车地点		付款方式	付款金额	所属公司	车辆名称	包含服务	是否已付款	头像图片	用户名		订单id
		参数名称：	drivername	birthday	telephone	takeday	backday	takeplace	backplace	payway	price	company	carname	service	isPay	photo	username	orderId
		返回值eg：
		{
		    "telephone":"137765489",
		    "id":17,
		    "drivername":"wangxin",
		    "birthday":"2016-08-14",
		    "takeday":"2016-08-14",
		    "backday":"2016-08-14",
		    "takeplace":"洛杉矶",
		    "backplace":"洛杉矶",
		    "payway":"支付宝",
		    "price":10000,
		    "company":"爱薇诗",
		    "carname":"兰博基尼",
		    "service":"司导",
		    "isPay":1,
		    "username":"rain"
		}
			