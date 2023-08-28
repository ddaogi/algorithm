function solution(wallpaper) {
    var answer = [];
    let yLength = wallpaper.length;
    let xLength = wallpaper[0].length;
    let lux =xLength;
    let luy =yLength;
    let rdx =1;
    let rdy =1;
    for(let i =0;i<yLength;i++){
        for(let j = 0;j<xLength;j++){
            if(wallpaper[i][j] === '#'){
                if(i < luy) luy = i;
                if(i >= rdy) rdy = i+1;
                if(j < lux) lux = j;
                if(j >= rdx) rdx = j+1;
            }
        }
    }
    answer.push(luy);
    answer.push(lux);
    answer.push(rdy);
    answer.push(rdx);
    return answer;
}