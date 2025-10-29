package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot1$1;

public interface Get_Flot_By_Flot extends
	Get_Q_By_Flot,
	Get_Flot_By_Q,
	Flot1$1
{
	@Lin_Dclar
	float Get_Flot_By_Flot(float By);
		@Override
		@Nevr_Neds_Ovrid
		default float Flot1$1(float In){return Get_Flot_By_Flot(In);}
}