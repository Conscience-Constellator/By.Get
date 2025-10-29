package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Dubl;

public interface Get_Dubl_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Dubl_By_Q,
	Point$Dubl<By_Typ>
{
	@Lin_Dclar
	double Get_Dubl_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default double Point$Dubl(By_Typ In)
		{return Get_Dubl_By_Point(In);}
}