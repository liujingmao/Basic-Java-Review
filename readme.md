### 今天学习笔记
#### 1. 处理了几个问题；
#### 2. 跟着华为开发学习阅读clickhouse源码，受益受益匪浅；
#### 3. 每天坚持写点西

### 20221220 日报

#### 1. 指导安装集群；
#### 2. 处理公有集群Spark-Streaming 写数据到HBase问题处理
#### 3. Ranger权限异常处理：关闭ranger鉴权后依然还需要增加jar包设置权限
#### 4. 生产环境测试集群增加es实例，待客户验证功能后再继续增加实例
#### 5. Ranger关闭权限评估
#### 6. 学习了Java，写了几个代码程序


### 20221221 日报
#### 1. 巡检集群，告警处理；
#### 2. Kafka-->FlinkSQL-->Hudi Table---Hive Beeline和Spark-shell 查询验证

### 20221222 计划
#### 1.视频演示昨日Kafka-->FlinkSQL-->Hudi Table---Hive Beeline和Spark-shell 查询验证流程；
#### 2.处理昨天巡检出来的告警
#### 3.继续 Flink 源码走读
#### 4.学习和复习Java基础知识

### 20221222 日志
#### 1. Flink 作业运行两天报错处理：开发排查后，给定参考参数，建议客户作业再次失败后，调整建议的参数和配置gc显示后，再提交；
#### 2. RM 和 Ranger状态异常
#### 3. 206集群主备oms异常:oms节点内存异常
#### 4. 提供陈用户和登录信息
#### 5. Flink 源码走读学习

### 20221223 工作日志
#### 1. 生产环境集群页面访问不流畅的问题处理；
#### 2. XXXX业务流程梳理；
#### 3. Flink 源码之RM启动走读；
#### 4. 测试环境集群搭建与交付

### 20221226 工作日志
#### 1. 测试环境集群交付
#### 2. RHCSA 练习，满分
#### 3. Ansible 练习RHCE, 满分
#### 4. Flink 源码走读Dispatcher启动

### 20221227 工作日志
#### 1. 生产环境acs环境机器取消nfs挂载；
#### 2. 与客户沟通hudi查询方案和了解业务需求；
#### 3. 测试环境处理信用卡团队c70集群服务不可用的问题；
#### 4. 生产环境uat集群ES服务节点fstab文件权限异常处理；

### 20221228 工作日志
#### 1. 生产环境告警处理
#### 2. 生产环境uat集群增加ES实例扩容处理，解决ES容量不足的问题；
#### 3. Ansible 复习和练习：生成硬件报告出错
#### 4. Flink 源码走读Dispatcher启动流程梳理

### 20221229 工作日志
#### 1. 开发测试环境配置互信；
#### 2. 配和测试环境和生产环境做Hudi表验证；

### 20221230 工作日志
#### 1. 处理Rangeradmin状态异常处理：增加JVM的OPT参数后，重启rangeradmin服务，其状态异常告警消队
#### 2. 生产环境安装集群和报错处理：依然还是/var/log文件标识符号的问题


### 20230103 工作日志
#### 1. Flink源码走读之Dispatcher启动流程梳理复习;
#### 2. Java JDK 源码阅读的前置条件
##### 2.1 理论先行
##### 2.2 端正心态
##### 2.3 打持久战
##### 2.4 兴趣先导
##### 2.5 重在实践
#### 3 Java 源码阅读工具
##### 3.1 Idea
##### 3.2 Source Insight
##### 3.3 NotePad++
#### 4 Java 源码阅读方法
##### 4.1 打好理论基础
##### 4.2 分清主次顺序
##### 4.3 以点带面
##### 4.4 勇于实践

### 20230121-20230125 春节值班日志及学习情况
#### 1. RHCE 和 RHCSA练习每天一次全程练习；
##### 1.1 总结自己经常出错的点，写到笔记本上
##### 1.2 争取春节期间达到连续四次双满分
#### 2. 学习了解PyTorch方面的机器学习基础知识；
##### 2.1 基础环境Anaconda的使用，其中创建基础环境中，切换内核的问题主要是为了解决py版本与PyTorch不兼容的问题
##### 2.2 张量的概念、获取与存储、基本操作以及底层逻辑
##### 2.2 PyTorch 加载数据练习入门：二维数据、3D数据、普通表格、有时间序列以及自然语言广西的数据加载
##### 2.3 PyTorch 连接值、序列值和分类值的处理

### 20230126 学习和工作日志
####  1. 处理了生产上集群的故障节点,梳理处理流程: 自动化页面关机不成功,向虚拟化同事反馈情况
####     他们查看日志反馈情况,可能是虚拟主机缺少一个与主机通信的虚拟化的服务,导致服务启动异常,先后台强制重启三个故障节点中的两个节点,
####     启动后,大数据服务组件恢复正常,虚拟化同事觉得需要留一台故障节点,节后回来协同红帽一起分析原因;
####  2. 练习RHCSA,出现低级的问题,导致之前做的练习又要重新开发
####  3. 复习Linux基本知识和了解深度学习的项目(识别CT图象的图象)的背景

### 20230130 学习和工作日志
####  1. Ansible 重难点复习：a. 创建逻辑卷的使用；b. 利用j2模版生成主机文件; c. 生成主机硬件报告；d. 批量创建用户
####  2. 处理生产环境yarn服务不可用和uat环境ES节点unconnected的问题;
####  3. 最新安装包压缩处理和上传到测试环境和生产环境;
####  4. pip 安装 pyarrow 异常处理
####  5. Java 设计模式和商业模式学习

### 20230131 学习和工作日志
#### 1. 实现第一次RHCSA和RHCE双满分
#### 2. 通过更新pip解决安装pyarrow异常的问题
#### 3. 设计模式之扩开放,修改关闭原则和策略模式的学习
#### 4. 生产环境Hetu服务的计算实例不能启动的原因跟进

### 20230201 学习和工作日志
#### 1. 实现第二次RHCSA和RHCE双满分;
#### 2. 解决生产环境Hetu服务的计算实例不能启动的问题;
#### 3. 进一步学习和理解Java的四大特征:封装,继承,抽象和多态;
#### 4. 学习深入理解Linux网络之网络收包总览(TCP/IP网络分层模型和内核收包路径)

### 20230202 学习和工作日志
#### 1. 解决HDFS写数据RPC高打补丁测试环境验证：滚动重启HDFS过程出现备NN启动异常:删除坏块后,重启NN,让其恢复正常;
#### 2. 完整练习RHCSA和RHCE，有点小错；
#### 3. Hudi基础知识学习(表类型，Timeline基础知识)

### 20230203 学习和工作日报
#### 1. 跟进生产环境FlinkServer消费Kafka数据写到Hudi发生Flink背压原因分析;
#### 2. 测试环境配置互信,解决HBase双写问题和安装客户端;
#### 3. RHCSA练习一次满分,RHCE没有练习;
#### 4. Hudi基础知识学习(Compaction触发机制和umask学习);

### 20230205 学习和工作日报
#### 1. 100道shell经常用的需求，自己实现了10个需求，基本可以写出来；
#### 2. 安装Linux机配置网络故障处理和yum源异常处理；
#### 3. 整理出工作中可以使用ansible-play的场景；

### 20230206 学习和工作日报
#### 1. 本周第一次实现RHCSA和RHCE双满分；
#### 2. 与PM沟通交流生产和测试环境跟进问题的整理；
#### 3. 生产环境和测试环境客户端需求处理;
#### 4. 胡博线程池查询HBase数据异常处理;

### 20230207 学习和工作日报
#### 1. 本周第二次实现RHCSA和RHCE双满分；
#### 2. FlinkSQL+Hudi背压问题跟进；
#### 3. 李生产客户端节点重新挂载需求处理;
#### 4. 胡博线程池查询HBase数据异常处理;

### 20230208 学习和工作日报
#### 1. 本周第三次实现RHCSA和RHCE双满分；
#### 2. FlinkSQL+Hudi背压问题跟进：源码参数学习和走读
#### 3. ArrayList源码走读：底层数据结构，优缺点和使用场景了解和学习；
#### 4. 生产环境计算集群hdfs坏块问题处理和跟进；






