/**
 * @author LuZhiqing
 * @Description: 迪杰斯特拉是查找单源点到图中各个点的最短路径的算法
 * @date 2018/11/9
 */
public class Dijkstra {
    private byte [] vis;
    private int [] dis;
    private Object [] v;
    private int [] neighbor;
    /**
     * 如果点之间没有直接连接，则赋值为无限大
     */
    private int [][] w;

    public void doDijkstra(int v){
        init(v);
        for(int i=0;i<this.neighbor.length;i++){
            int ni=neighbor[i];
            vis[ni]=1;
            for(int j=0;j<this.v.length;j++){
                int len = dis[ni] + w[ni][j];
                dis[j]=dis[j]>len?dis[j]:len;
            }
        }
    }
    public void init(int n){
        for(int i=0;i<this.v.length;i++){
            if(i==n){continue;}
            dis[i] = w[n][i];
        }
    }
}
