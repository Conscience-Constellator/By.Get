package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$ChR;

public interface Get_ChR_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_ChR_By_Q,
	Point$ChR<By_Typ>
{
	@Lin_Dclar
	char Get_ChR_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default char Point$ChR(By_Typ In)
		{return Get_ChR_By_Point(In);}
}