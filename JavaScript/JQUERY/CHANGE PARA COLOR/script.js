$(document).ready(function() {
    // Wait for the page to load before running any jQuery code
  
    // Attach a click event handler to the button
    $('#color-btn').click(function() {
      // Change the background color of the target paragraph to red
      $('#target-para').css('background-color', 'red');
    });
  });