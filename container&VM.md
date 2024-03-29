# 看到一篇讲解关于虚拟化（VM）与Container的区别的文章写得很好，现转载一下：
**原文链接：https://blog.csdn.net/weixin_38885808/article/details/81130153**

## 首先，Container技术和服务器虚拟化并不是一样的技术：
两者虽然都属于虚拟化的技术，目标都是为了将一套应用程序所需的执行环境打包起来，建立一个孤立环境，方便在不同的硬件中移动，但两者的运作思维截然不同。
1. 简单来说，传统虚拟化技术如vSphere或Hyper-V是以操作系统为中心，而Container技术则是一种以应用程序为中心的虚拟化技术。
2. 传统虚拟化技术从操作系统层下手，目标是建立一个可以用来执行整套操作系统的沙盒独立执行环境，习惯以虚拟机(Virtual Machine)来称呼。
3. Container技术则是直接将一个应用程序所需的相关程序代码、函式库、环境配置文件都打包起来建立沙盒执行环境，Container技术产生的环境就称为Container。

## 两者具体区别
1. 虚拟机需要安装操作系统(安装Guest OS)才能执行应用程序，而Container内不需要安装操作系统就能执行应用程序
2. Container技术不是在OS外来建立虚拟环境，而是在OS内的核心系统层来打造虚拟执行环境，透过共享Host OS的作法，取代一个一个Guest OS的功用。Container也因此被称为是OS层的虚拟化技术。
3. Container是轻量级虚拟化技术
4. Container技术采取共享Host OS的作法，而不需在每一个Container内执行Guest OS，因此建立Container不需要等待操作系统开机时间，不用1分钟或几秒钟就可以启用，远比需要数分钟甚至数十分钟才能开启的传统虚拟机来的快。

## Container技术的发展
早在1982年，Unix系统内建的chroot机制也是一种Container技术。其他如1998年的FreeBSD jails、2005年出现的Solaris Zones和OpenVZ，或像是Windows系统2004年就有的Sandboxie机制都属于在操作系统内建立孤立虚拟执行环境的作法，都可称为是Container的技术。直到2013年，dotCloud这家PaaS服务公司开源释出了一套将Container标准化的平台Docker，大受欢迎，所以，dotCloud决定以Docker为名成立新公司力推。

