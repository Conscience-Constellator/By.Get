package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Long;

public interface Get_Long_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Long_By_Q,
	Point$Long<By_Typ>
{
	@Lin_Dclar
	long Get_Long_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default long Point$Long(By_Typ In)
		{return Get_Long_By_Point(In);}
}