package Segundos_Parciales.Par2_23_02.Ej2;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class ScoreBoard <S extends Comparable<? super S>> extends TreeSet<PlayerScore<S>> {
	public List<PlayerScore<S>> getTopScores(int n) {
		List<PlayerScore<S>> toRet = new ArrayList<PlayerScore<S>>();
		int i = 0;
		for (PlayerScore<S> elem : this) {
			i++;
			toRet.add(elem);
			if (i == n) {
				return toRet;
			}
		}
		return toRet;
	}
}
