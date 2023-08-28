function solution(park, routes) {
    let curX = 0
    let curY = 0
    for(let i=0;i<park.length;i++){
        for(let j = 0; j<park[0].length;j++){
            if(park[i][j] == 'S'){
                curX = j
                curY = i
            }
        }
    }
    var answer = [];
    
    let dx = 0
    let dy =0;
    let xLength = park[0].length;
    let yLength = park.length;
    let nextX;
    let nextY;
    for(let i = 0;i<routes.length;i++){
    	let tempArr = routes[i].split(' ')
        if(tempArr[0] === 'E'){
            dx = 1;
            dy = 0;
        }else if(tempArr[0] === 'S'){
            dx = 0;
            dy = 1;
        }else if(tempArr[0] === 'W'){
            dx = -1;
            dy = 0;
        }else{
            dx = 0;
            dy = -1;
        } 	
        let distance = parseInt(tempArr[1]);
        nextX = curX;
        nextY = curY;
        for(let j = 0; j<distance; j++){
            console.log(nextX,nextY);
            nextX = nextX+dx;
            nextY = nextY+dy;
          
       		if(nextX <0 || nextX >= xLength || nextY <0 || nextY >= yLength || park[nextY][nextX] ==="X"){
                nextX = curX;
                nextY = curY;
                break;
            }
        }
        curX = nextX;
        curY = nextY;
    }
    answer.push(curY);
    answer.push(curX);
    
    return answer;
}