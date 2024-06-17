package Segundos_Parciales.Par2_23_02.Ej1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class RouteCentral{
    private Map<String, Map<String,Integer>> mapa = new HashMap<>();
    private Function<Integer, Integer> twdist;
    public RouteCentral(Function<Integer, Integer> twdist){
        this.twdist=twdist;
    }

    public int getDirectRouteMiles(String org,String dest){
        Integer c;
        if( !mapa.containsKey(org) || (c=mapa.get(org).getOrDefault(dest,null))==null ){
            throw new RuntimeException("Route does not exists");
        }
        return c;
    }

    public void addOneWayRoute(String org,String dest,int millas){
    	mapa.putIfAbsent(org,new HashMap<>());
    	mapa.get(org).putIfAbsent(dest,millas);
    }
    public void addTwoWayRoute(String org,String dest,int millas){
        addOneWayRoute(org,dest,twdist.apply(millas));
        addOneWayRoute(dest,org,twdist.apply(millas));
    }

    public int getOneStopRouteMiles(String org,String esc,String dest){
    	if( checkIfExist(org,esc) && checkIfExist(esc,dest) ){
        	return mapa.get(org).get(esc) + mapa.get(esc).get(dest);
        }
        throw new RuntimeException("Route does not exists");
    }

    public void changeRouteCost(String org,String dest,int value){
    	if(!checkIfExist(org,dest)){
    		throw new RuntimeException("Route does not exists");
    	}
        mapa.get(org).put(dest,value);
    }
    private boolean checkIfExist(String org,String dest){
    	return mapa.containsKey(org) && mapa.get(org).containsKey(dest);
    }
}


