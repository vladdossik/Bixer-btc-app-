# Bixer-btc-app-
my first android app. 
You can download this application by clicking on the link: https://play.google.com/store/apps/details?id=biz.bixer.bixer

The application was made as a project in the lyceum where I have  studied. It includes a bitcoin mixer, analytics, news, brief information about the listed and about the developer. For convenience, the share function is implemented. You can also contact the developer from the application using the help function.

Main page. Here I added a webview, for the fastest access to one of the news sources: https://cointelegraph.com/. I found it as simple as possible.

![photo_2019-07-02_22-03-04 (2)](https://user-images.githubusercontent.com/45006912/60539535-9b7c4f00-9d15-11e9-8c63-534215e0293a.jpg)

Menu. From this page you can get to all the others.

![photo_2019-07-02_22-02-58](https://user-images.githubusercontent.com/45006912/60539571-afc04c00-9d15-11e9-8953-057cec7785e7.jpg)

Mixer page. This is also a webview, but I use http://bixer.biz/. Anonymization service, which complicates or makes it almost impossible to monitor transactions in the Bitcoin system. Client's funds are divided into small parts, after which these parts are mixed in random order with parts of other customers. As a result of all operations, a specified amount of cryptocurrency comes to the final recipient, but in small batches from various randomly selected participants.

![photo_2019-07-02_22-03-04](https://user-images.githubusercontent.com/45006912/60539671-f0b86080-9d15-11e9-9d8f-ffc8923c433e.jpg)

Analytics and statistics pages.Here you can find the price of bitcoin, information about the last block, average block size for the last 24 hours, the hashrate, the average block calculation time, the average block size, the average number of transactions per second and the network commission analysis for the last 36 blocks. I used API of blockchaininfo(https://www.blockchain.com/ru/api).

![photo_2019-07-02_22-03-03](https://user-images.githubusercontent.com/45006912/60539686-f9a93200-9d15-11e9-9aa3-7d941eb51da9.jpg)
![photo_2019-07-02_22-03-02 (2)](https://user-images.githubusercontent.com/45006912/60539692-fca42280-9d15-11e9-8220-32a99096a222.jpg)

News page. At this stage, I realized that all applications related to news about cryptocurrency use only 1 news resource. So, I decided to use a little more .... 9). This is done so that everyone has a choice. I used webview to display news resources. This part needs some work. Since it was necessary to write the application in the shortest lines, frequent repetition of the code was used.

![photo_2019-07-02_22-03-02](https://user-images.githubusercontent.com/45006912/60539696-0168d680-9d16-11e9-904e-49297f48d344.jpg)

About page. Here I added information about Bitcoin mixer, analytics, news and about us.Here I used RecyclerView. For me it was a bit difficult, because I could not set up the correct work for a long time.

![photo_2019-07-02_22-03-01](https://user-images.githubusercontent.com/45006912/60539701-0594f400-9d16-11e9-9064-ba1496897a78.jpg)

Share page. Here I added small pictures, clicking on which will help you find us in a telegram, instagram, twitter, github, facebook. There is also a link to the site. By clicking on the share button you can share a link to the site using the functions of the smartphone. This page needs some work (many links have changed).

![photo_2019-07-02_22-03-00](https://user-images.githubusercontent.com/45006912/60539708-07f74e00-9d16-11e9-9aa6-bb8479b52dc9.jpg)

Help page.This page is used to contact the developer. It is necessary to fill in the fields and clicking the Send button gives the client the choice of which email-client to use. It was too easy, since I used Youtube when implementing this part of the project.

![photo_2019-07-02_22-02-59](https://user-images.githubusercontent.com/45006912/60539709-09287b00-9d16-11e9-829f-bca7ed451531.jpg)
