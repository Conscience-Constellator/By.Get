package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Point;

public interface Get_Point_By_ChR<Valu_Typ> extends
	Get_Q_By_ChR,
	Get_Point_By_Q<Valu_Typ>,
	ChR$Point<Valu_Typ>
{
	@Lin_Dclar
	Valu_Typ Get_Point_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default Valu_Typ ChR$Point(char In)
		{return Get_Point_By_ChR(In);}
}