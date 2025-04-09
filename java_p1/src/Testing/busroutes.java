package Testing;

public class busroutes {
	
	int totseats,remseats,cost;
	String routeId,src,dest;
	
	busroutes(String routeId,String src,String dest,int totseats,int remseats,int cost)
	{
		this.routeId = routeId;
		this.src = src;
		this.dest = dest;
		this.totseats = totseats;
		this.remseats = remseats;
		this.cost =cost;
	}

}
