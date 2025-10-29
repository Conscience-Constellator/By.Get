package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Point;

public interface Get_Point_By_Dubl<Valu_Typ> extends
	Get_Q_By_Dubl,
	Get_Point_By_Q<Valu_Typ>,
	Dubl$Point<Valu_Typ>

{
	@Lin_Dclar
	Valu_Typ Get_Point_By_Dubl(double By);
		@Override @Nevr_Neds_Ovrid
		default Valu_Typ Dubl$Point(double In)
		{return Get_Point_By_Dubl(In);}
}