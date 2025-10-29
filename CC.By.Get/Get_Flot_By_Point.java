package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Flot;

public interface Get_Flot_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Flot_By_Q,
	Point$Flot<By_Typ>
{
	@Lin_Dclar
	float Get_Flot_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default float Point$Flot(By_Typ By)
		{return Get_Flot_By_Point(By);}
}