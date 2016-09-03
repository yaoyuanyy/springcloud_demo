# springcloud_demo

项目：
(1)springcloud_demo_registry_center #注册中心

(2)springcloud_demo_provider #注册服务，服务会向注册中心注册

(3)springcloud_demo_provider2 #注册服务，同样，服务会向注册中心注册,

(4)springcloud_demo_consumer_ribbon #使用ribbon实现负载均衡 同时也加入了断路器

(5)springcloud_demo_consumer_feign #使用feign实现负载均衡 同时也加入了断路器

(6)springcloud_demo_consumer_ribbon_hystrixdashborad #使用hystrixdashborad负载均衡监控

(7)springcloud_demo_consumer_turbine #使用turbine负载均衡监控

(8)springcloud_demo_config_server #配置服务端

(9)springcloud_demo_config_client #配置客户端

(10)springcloud_demo_config #配置仓库

测试用例：
A、查看服务在注册中心的情况
   需启动项目(1)、(2)，访问注册中心地址：http://localhost:1111
   
B、测试ribbon负载均衡
   启动项目(1)、(2)、(3)、(4)，访问地址：http://localhost:3333/add,多刷新几次，之后查看项目(2)、(3)的console日志信息
   会看到：/add, host:hostname, service_id:servicename, result:30
   注意：项目(2)、(3)的spring.application.name是一样的，server.port不一样

C、测试断路器
   启动项目(1)、(2)、(4)，访问地址：http://localhost:3333/add,正常页面会显示结果：30
   这时关掉项目(2)，再次访问地址：http://localhost:3333/add,如果没有断路器，页面显示：
   Whitelabel Error Page
   This application has no explicit mapping for /error, so you are seeing this as a fallback.
   Sat Sep 03 15:04:23 CST 2016
   There was an unexpected error (type=Not Found, status=404).
   No message available
   加入断路器后，页面显示：
   error
   查看项目代码，你会明白他的原理的
   
   注意：测试断路器时，可以不启动注册中心项目(1)，和服务(2),只需启动项目(4)本身，但是项目代码需改动，具体如下：
   1、AppRun注释掉@EnableDiscoveryClient
   2、注释掉ComputeService.addService()方法的return restTemplate.getForEntity("http://SERVICE1/add?a=10&b=20",
   String.class).getBody();，打开原来被注释掉的代码：int randomInt = random.nextInt(10);············· randomInt;
   3、这时启动项目(4)，访问地址：http://localhost:3333/add，你会看到页面显示正常结果：数字；异常结果：error，如果没有断路器，
   异常结果会显示：call dependency service fail.这说明断路器起了作用
D、测试用feign断路器：与测试ribbon步骤一样，只不过feign是在类上加断路器，这样所有的方法用这一个断路器就可以了，而ribbon是在
   方法上加断路器，一个方法一个，各有优点，实际还要灵活使用
   
E、
F、
G、
H、
I、
J、
K、
