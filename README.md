# spring-cloud-ali-nacos-server
此项目使用 NACOS为底层框架 实现服务自动注册

需要注意以下内容：
> 1. NACOS（IP、PORT）配置在系统内部，需要提前配置正确的信息；
> 2. 服务启动后，自动会将自身注册到 NACOS中；
> 3. 根据相同的服务名称，可自动创建集群；
