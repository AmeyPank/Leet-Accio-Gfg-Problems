/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
  let currentAltitude = 0;
  // Highest altitude currently is 0.
  let highestPoint = currentAltitude;

  for (let i = 0; i < gain.length; i++) {
    let altitudeGain = gain[i];
    // Adding the gain in altitude to the current altitude.
    currentAltitude += altitudeGain;
    // Update the highest altitude.
    highestPoint = Math.max(highestPoint, currentAltitude);
  }

  return highestPoint;
};
