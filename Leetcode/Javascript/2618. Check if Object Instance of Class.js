/**
 * @param {any} obj
 * @param {any} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
  if (obj === null || typeof obj === "undefined" || typeof classFunction !== "function") {
    return false;
  }
  
  if (typeof obj[classFunction.name] === "function") {
    return true;
  }
  
  var proto = Object.getPrototypeOf(obj);
  while (proto !== null) {
    if (proto.constructor === classFunction) {
      return true;
    }
    proto = Object.getPrototypeOf(proto);
  }
  
  return false;
};


/**
 * checkIfInstanceOf(new Date(), Date); // true
 */