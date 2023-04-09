fetch("https://dummyjson.com/quotes/35")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log("DATA", data);
    console.log(data.quote);
    console.log(data.author);
  });