 #***我的第三次提交***
 **********************
 ****关于并发与多线程****
 

 
自己下去还参考了[CSDN](https://www.csdn.net/)
 
 

![Picture](/Users/mac/Desktop/timg.jpeg)

![Picture]( https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=aoteman&step_word=&hs=0&pn=0&spn=0&di=124960&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1343933117%2C4053295934&os=3220966479%2C619899098&simid=3407045900%2C313211661&adpicid=0&lpn=0&ln=1640&fr=&fmq=1579345345912_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fwh%3D680%2C800%2Fsign%3D1cf4a757b73eb1354492bfbd9e2e84eb%2F5243fbf2b21193132c80740f6e380cd790238d4a.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fr_z%26e3Bkwt17_z%26e3Bv54AzdH3Fq7jfpt5gAzdH3F0jjam8mdmnn0n0nandnnmcnaaa&gsm=&rpstart=0&rpnum=0&islist=&querylist=&force=undefined)


```javascript
package main.java.com.damo.concurrency;

public class BasicRunnable implements  Runnable{

        @Override
        public void run() {
            System.out.println("THREAD START " +Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                Processing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("THREAD END " +Thread.currentThread().getName());
        }

        private void Processing() throws InterruptedException {
            System.out.println("PROCESSING...");
            Thread.sleep(5000);
        }


        public static void main(String[] args) {
            Thread t1=new Thread(new BasicRunnable(),"t1");
            Thread t2=new Thread(new BasicRunnable(),"t2");

            System.out.println("sarting threads");
            t1.start();
            t2.start();
            System.out.println("runnable threads has been started");

            System.out.println("starting threads");
            Thread t3=new BasicThread();
            Thread t4=new BasicThread();
            t3.start();
            t4.start();
            System.out.println("runnable threads has been started");

        }

}

```
 

