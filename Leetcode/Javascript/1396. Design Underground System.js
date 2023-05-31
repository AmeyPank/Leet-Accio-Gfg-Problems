function UndergroundSystem() {
    const checkIns = new Map(); // Stores check-in information
    const journeyTimes = new Map(); // Stores journey times

    function checkIn(id, stationName, t) {
        checkIns.set(id, { stationName, t });
    }

    function checkOut(id, stationName, t) {
        const checkInInfo = checkIns.get(id);
        const journeyKey = `${checkInInfo.stationName}:${stationName}`;
        const journeyTime = t - checkInInfo.t;

        if (journeyTimes.has(journeyKey)) {
            const { totalTime, count } = journeyTimes.get(journeyKey);
            journeyTimes.set(journeyKey, {
                totalTime: totalTime + journeyTime,
                count: count + 1,
            });
        } else {
            journeyTimes.set(journeyKey, { totalTime: journeyTime, count: 1 });
        }

        checkIns.delete(id);
    }

    function getAverageTime(startStation, endStation) {
        const journeyKey = `${startStation}:${endStation}`;
        const { totalTime, count } = journeyTimes.get(journeyKey);
        return totalTime / count;
    }

    return {
        checkIn,
        checkOut,
        getAverageTime,
    };
}