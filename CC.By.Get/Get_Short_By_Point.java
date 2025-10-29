package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Short;

public interface Get_Short_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Short_By_Q,
	Point$Short<By_Typ>
{
	@Lin_Dclar
	short Get_Short_By_Point(By_Typ By);
		@Override
		@Nevr_Neds_Ovrid
		default short Point$Short(By_Typ In){return Get_Short_By_Point(In);}
}