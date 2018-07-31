# baiduSpider
## 需求
通过读取txt文件进行百度搜索爬取页面上信息：  
![](https://s26.postimg.cc/tx9ldxxk9/image.png)  
若抓取到的是百度百科将对其url再次爬取：  
![](https://s26.postimg.cc/5grfjgp3t/image.png)  
## 解决思路  
思维导图：  
[![SGV_N6_KEL_04_V5_FNPFMUED.png](https://s26.postimg.cc/9eep8jyyx/SGV_N6_KEL_04_V5_FNPFMUED.png)](https://postimg.cc/image/q267b1tqd/)  
## 结果
输入数据：  
[![VQG2_NBG9_VT_J_D_Q5_F0.png](https://s26.postimg.cc/pf7almzg9/VQG2_NBG9_VT_J_D_Q5_F0.png)](https://postimg.cc/image/qu8vad0j9/)  
输出数据：  
[![HHM_DO_B_AOZ8_RGJFAYD_R.png](https://s26.postimg.cc/q4q2y255l/HHM_DO_B_AOZ8_RGJFAYD_R.png)](https://postimg.cc/image/opoi9c42d/)  
[![8_3_QXWHCN_EH8_4_D5_SWH_4.png](https://s26.postimg.cc/57tuteua1/8_3_QXWHCN_EH8_4_D5_SWH_4.png)](https://postimg.cc/image/5kl8zlcjp/)  

## 使用
因为想要运行即可得到结果，所以打成jar包，/BaiDuPC.jar  
使用说明：  

 1. 需要安装java环境（jdk）  
 2. 把需要搜索的词放到searchWords.txt里（一行一次搜索）  
 3. 把searchWord.txt放到c盘根目录下（文件名不能错）  
 4. 进入cmd，找到BaiDuPC.jar的目录下运行    java -Dfile.encoding=utf-8 -jar BaiDuPC.jar  
 5. 会在C盘根目录下生成PuTong.txt(普通的爬虫结果），BaiDuBaiKe.txt（百度百科的爬虫结果）两个文件  
 6. 新建一个excel文档，点击数据-导入数据（以 | 为固定分隔符）  