/**
 * @author LuZhiqing
 * @Description: �Ͻ�˹�����ǲ��ҵ�Դ�㵽ͼ�и���������·�����㷨
 * @date 2018/11/9
 */
public class Dijkstra {
    private byte [] vis;
    private int [] dis;
    private Object [] v;
    private int [] neighbor;
    /**
     * �����֮��û��ֱ�����ӣ���ֵΪ���޴�
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
