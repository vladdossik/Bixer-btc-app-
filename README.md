# Bixer-btc app
My first android app. 
You can download this application by clicking on the link: https://play.google.com/store/apps/details?id=biz.bixer.bixer

![photo_2019-08-17_03-18-59](https://user-images.githubusercontent.com/45006912/63211905-62057480-c106-11e9-9f58-1e8cd6f2aa5f.jpg)  
![photo_2019-08-17_15-50-25](https://user-images.githubusercontent.com/45006912/63211937-c9bbbf80-c106-11e9-96a4-5954f84640b6.jpg)  
![photo_2019-08-17_15-52-07](https://user-images.githubusercontent.com/45006912/63211957-08ea1080-c107-11e9-8cb8-9756f43e2fa9.jpg)  
![photo_2019-08-17_03-18-59 (2)](https://user-images.githubusercontent.com/45006912/63211985-5e262200-c107-11e9-9070-68d5e5586db6.jpg)  
![photo_2019-08-17_03-18-59 (3)](https://user-images.githubusercontent.com/45006912/63211971-2f0fb080-c107-11e9-80b0-ec3909efd16f.jpg)  
![photo_2019-08-17_03-18-59 (4)](https://user-images.githubusercontent.com/45006912/63211974-45b60780-c107-11e9-8789-543c852a0ae6.jpg)  
![photo_2019-08-17_03-18-59 (5)](https://user-images.githubusercontent.com/45006912/63211976-48186180-c107-11e9-81b3-16ff745657f9.jpg)  
![photo_2019-08-17_03-18-59 (7)](https://user-images.githubusercontent.com/45006912/63211991-739b4c00-c107-11e9-8846-67940422207b.jpg)  
![photo_2019-08-17_03-18-59 (6)](https://user-images.githubusercontent.com/45006912/63212006-962d6500-c107-11e9-90a2-2a37a7b8799e.jpg)  
![photo_2019-08-17_03-18-59 (8)](https://user-images.githubusercontent.com/45006912/63212007-988fbf00-c107-11e9-89c8-54aae17038c8.jpg)  
![photo_2019-08-17_03-18-58](https://user-images.githubusercontent.com/45006912/63212008-9af21900-c107-11e9-949c-82bf5bcf95ed.jpg)

The application was made as a project in the lyceum where I have  studied. It includes a bitcoin mixer, analytics, news, brief information about the listed and about the developer. For convenience, the share function is implemented. You can also contact the developer from the application using the help function.
## Update.
In version 1.1 I added Splash Screen and Bitcoin-checker.
To add the CORRECT splash screen I used https://habr.com/ru/post/312516/. It should be until the application loads. No delays added.
Bitcoin-checker looks like a bitcoin calculator. You need to enter the number of bitcoins and the application will show their price in dollars.
## Main page.
Here I added a webview for the fastest access to one of the news sources: https://cointelegraph.com/. I found it as simple as possible.
## Menu. 
From this page you can get to all the others.
## Mixer page. 
This is also a webview, but I use http://bixer.biz/. Anonymization service, which complicates or makes it almost impossible to monitor transactions in the Bitcoin system. Client's funds are divided into small parts, after which these parts are mixed in random order with parts of other customers. As a result of all operations, a specified amount of cryptocurrency comes to the final recipient, but in small batches from various randomly selected participants.
## Analytics and statistics pages.
Here you can find the price of bitcoin, information about the last block, average block size for the last 24 hours, the hashrate, the average block calculation time, the average block size, the average number of transactions per second and the network commission analysis for the last 36 blocks. I used API of blockchaininfo(https://www.blockchain.com/ru/api).
## News page. 
At this stage, I realized that all applications related to news about cryptocurrency use only 1 news resource. So, I decided to use a little more .... 9). This is done so that everyone has a choice. I used webview to display news resources. This part needs some work. Since it was necessary to write the application in the shortest lines, frequent repetition of the code was used.
## About page. 
Here I added information about Bitcoin mixer, analytics, news and about us.Here I used RecyclerView. For me it was a bit difficult, because I could not set up the correct work for a long time.
## Share page.
Here I added small pictures, clicking on which will help you find us in a telegram, instagram, twitter, github, facebook. There is also a link to the site. By clicking on the share button you can share a link to the site using the functions of the smartphone. This page needs some work (many links have changed).
## Help page.
This page is used to contact the developer. It is necessary to fill in the fields and clicking the Send button gives the client the choice of which email-client to use. It was too easy, since I used Youtube when implementing this part of the project
