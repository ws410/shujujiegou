package ch06;

public class SY_CampusRoadmap {
	public final static int INFINITY =Integer.MAX_VALUE;

	public static MGraph getCampusRoadmap() {
		Object vexs[] = { "正校门", "东校门", "西校门", "北校门", "食堂", "磁悬浮列车实验室","樱花大道","图书馆","体育场","体育馆","游泳馆","礼堂","教学楼","宿舍" };
		int[][] arcs = { 	
				{-1,0,0,0,35,0,0,0,0,0,0,5,0,0},//0
				{0,-1,0,0,0,0,0,0,0,0,75,0,0,10},//1
				{0,0,-1,0,30,0,0,5,0,0,0,0,0,0},//2
				{0,0,0,-1,0,0,15,50,0,15,20,0,0,0},//3
				{35,0,30,0,-1,0,0,0,60,0,0,40,0,0},//4
				{0,0,0,0,0,-1,0,0,45,0,0,10,0,0},//5
				{0,0,0,15,0,0,-1,0,0,0,0,0,0,0},//6
				{0,0,5,50,0,0,0,-1,0,0,0,0,0,0},//7
				{0,0,0,0,60,45,0,0,-1,0,0,50,0,0},//8
				{0,0,0,15,0,0,0,0,0,-1,20,0,0,100},//9
				{0,75,0,20,0,0,0,0,0,20,-1,0,0,0},//10
				{5,0,0,0,40,10,0,0,50,0,0,-1,25,0},//11
				{0,0,0,0,0,0,0,0,0,0,0,25,-1,20},//12
				{0,10,0,0,0,0,0,0,0,100,0,0,20,-1},//13	
			};
		for (int i = 0; i < arcs.length; i++) {
			for (int j = 0; j < arcs.length; j++) {
				if(arcs[i][j]==0){
					arcs[i][j]=INFINITY;
				}
				if(arcs[i][j]==-1){
					arcs[i][j]=0;
				}
			}
		}
			MGraph G = new MGraph(GraphKind.UDG, 14, 19, vexs, arcs);
			return G;
	}
}
