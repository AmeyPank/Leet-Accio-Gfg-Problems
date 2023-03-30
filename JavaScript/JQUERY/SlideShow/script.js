$(document).ready(function() {
    // Wait for the page to load before running any jQuery code
  
    // Set the first image as the current image
    var currentImage = $('.slideshow img:first-child');
  
    // Set an interval to change the image every 3 seconds
    setInterval(function() {
      // Hide the current image
      currentImage.hide();
  
      // Set the next image as the current image
      currentImage = currentImage.next('img');
      if (currentImage.length === 0) {
        currentImage = $('.slideshow img:first-child');
      }
  
      // Show the new current image
      currentImage.show();
    }, 3000);
  });
  