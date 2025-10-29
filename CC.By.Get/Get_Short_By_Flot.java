package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Short;

public interface Get_Short_By_Flot extends
	Get_Q_By_Flot,
	Get_Short_By_Q,
	Flot$Short
{
	@Lin_Dclar
	short Get_Short_By_Flot(float By);
		@Override
		@Nevr_Neds_Ovrid
		default short Flot$Short(float In){return Get_Short_By_Flot(In);}
}