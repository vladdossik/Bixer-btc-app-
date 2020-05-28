[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) 
# Bixer-btc-app-
my first android app. 
You can download this application by clicking on the link: https://play.google.com/store/apps/details?id=biz.bixer.bixer

The application was made as a project in the lyceum where I have  studied. It includes a bitcoin mixer, analytics, news, brief information about the listed and about the developer. For convenience, the share function is implemented. You can also contact the developer from the application using the help function.

Main page. Here I added a webview, for the fastest access to one of the news sources: https://cointelegraph.com/. I found it as simple as possible.

![photo_2019-07-02_22-03-06](https://user-images.githubusercontent.com/45006912/60615133-1c4f4f80-9dd7-11e9-9824-82716f0343f4.jpg)

Menu. From this page you can get to all the others.

![photo_2019-07-02_22-02-58](https://user-images.githubusercontent.com/45006912/60615182-38eb8780-9dd7-11e9-965a-24abd0ee7185.jpg)

Mixer page. This is also a webview, but I use http://bixer.biz/. Anonymization service, which complicates or makes it almost impossible to monitor transactions in the Bitcoin system. Client's funds are divided into small parts, after which these parts are mixed in random order with parts of other customers. As a result of all operations, a specified amount of cryptocurrency comes to the final recipient, but in small batches from various randomly selected participants.


Analytics and statistics pages.Here you can find the price of bitcoin, information about the last block, average block size for the last 24 hours, the hashrate, the average block calculation time, the average block size, the average number of transactions per second and the network commission analysis for the last 36 blocks. I used API of blockchaininfo(https://www.blockchain.com/ru/api).

![photo_2019-07-02_22-03-03](https://user-images.githubusercontent.com/45006912/60615386-aa2b3a80-9dd7-11e9-97ff-498552ce6789.jpg)
![photo_2019-07-02_22-03-02 (2)](https://user-images.githubusercontent.com/45006912/60615400-b31c0c00-9dd7-11e9-955b-acf985e0f784.jpg)

News page. At this stage, I realized that all applications related to news about cryptocurrency use only 1 news resource. So, I decided to use a little more .... 9). This is done so that everyone has a choice. I used webview to display news resources. This part needs some work. Since it was necessary to write the application in the shortest lines, frequent repetition of the code was used.


