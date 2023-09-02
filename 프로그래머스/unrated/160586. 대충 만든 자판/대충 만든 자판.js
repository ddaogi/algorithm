function solution(keymap, targets) {
    var answer = [];
    var map = {}; 
    for(let k = 0; k < keymap.length; k++) {
        for(let l = 0; l < keymap[k].length; l++) {
            let char = keymap[k][l];
            if(map[char] === undefined || l < map[char]) {
                map[char] = l + 1;
            }
        }
    }

    for(let i = 0; i < targets.length; i++) {
        let count = 0;
        for(let j = 0; j < targets[i].length; j++) {
            let letter = targets[i][j];
            if(map[letter] !== undefined) {
                count += map[letter];
            } else {
                count = -1;
                break; 
            }
        }
        answer.push(count);
    }
    return answer;
}
