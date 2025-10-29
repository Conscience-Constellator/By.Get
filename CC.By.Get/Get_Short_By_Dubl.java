package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Dubl$Short;

public interface Get_Short_By_Dubl extends
	Get_Q_By_Dubl,
	Get_Short_By_Q,
	Dubl$Short
{
	@Lin_Dclar
	short Get_Short_By_Dubl(double By);
		@Override
		@Nevr_Neds_Ovrid
		default short Dubl$Short(double In){return Get_Short_By_Dubl(In);}
}