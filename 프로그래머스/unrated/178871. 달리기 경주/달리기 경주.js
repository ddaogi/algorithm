function solution(players, callings) {
    var answer = [];
    var playerIndexMap = new Map();
    for (let i = 0; i < players.length; i++) {
        playerIndexMap.set(players[i], i);
    }

    for (let i = 0; i < callings.length; i++) {
        let calling = callings[i];
        if (playerIndexMap.has(calling)) {
            let index = playerIndexMap.get(calling);
            if (index > 0) 
                [players[index], players[index - 1]] = [players[index - 1], players[index]];
                playerIndexMap.set(players[index], index);
                playerIndexMap.set(players[index - 1], index - 1);
            
        }
    }

    return players;
}
