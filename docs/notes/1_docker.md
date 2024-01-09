**<div align='center'><span style="font-size: large; "><b>docker</b></span></div>**

### 分隔符物理机/虚拟化/docker区别

<img src="../imgs/1_docker/docker_01.png" alt="没有图片">

### docker使用
#### java工程构建image环境安装
```shell
# git安装
    yum install -y git
# openjdk_8安装
    # 查看yum库中的Java安装包
    yum -y list java*
    # 安装需要的jdk版本的所有java程序
    yum -y install java-1.8.0-openjdk*
    # 查看jdk安装目录
    cd /usr/lib/jvm
    cd java-1.8.0-openjdk 
    # 默认安装路径
    /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.151-1.b12.el7_4.x86_64
    # 卸载
    # yum -y remove java-1.8.0-openjdk*
# maven安装
    wget https://repo.huaweicloud.com/apache/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.tar.gz
    tar -zxvf apache-maven-3.8.1-bin.tar.gz -C /usr/local/
    ln -s apache-maven-3.8.1 maven
    vim /etc/profile
    # export MAVEN_HOME=/usr/local/maven/
    # export PATH=${PATH}:${MAVEN_HOME}/bin
    source /etc/profile
    mvn -v
```
#### docker常见命令
