# Hacker News Android Sample App
Created a Sample Hacker News android APP. which uses MVP Architecture.

There two screens one being Home Screen which shows the stories in the recycler view. 
The classes under Home package are related to this screen.

The second screen Shows a detailed title and text of a story along with the comments.
The classes under story package are related to this screen.

This code consists of UI Test using Espresso(AppUITest class) & basic Junit testing for Utils package classes.

I have used multiple libraries.
```
1)ButterKnife
2)Espresso
3)RxJava & RxAndroid
4)retrofit
5)GSON
```

This App fetches data from Hacker news webservices.
```
1)Fetches the ids of the top stories
https://hacker-news.firebaseio.com/v0/topstories.json
2)Fetches the details of the each story we use id to fetch data.
https://hacker-news.firebaseio.com/v0/item/2921983.json
3) We can fetch comments from the same url that we used for fetching stories
https://hacker-news.firebaseio.com/v0/item/2921983.json
```

