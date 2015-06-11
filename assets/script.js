//vars
// var pH;
// var PaCO2;
// var HCO3;
// var expectedPaCO2;
// var lowerLimitExpectedpH;
// var UpperLimitExpectedpH;


//preliminary checks
function preliminaryCheck() {
	window.pH = document.getElementById('pH').value;
	window.PaCO2 = document.getElementById('PaCO2').value;
	window.HCO3 = document.getElementById('HCO3').value;
	console.log(pH);
	console.log(PaCO2);
	console.log(HCO3);
if (pH > 7.35 && pH < 7.45) {
	if (PaCO2 < 35) {
		 printOutput("Mixed case of Respiratory Alkalosis");
		winterGreen_28_6();
	}
	if (PaCO2 > 45) {
		 printOutput("Mixed case of Respiratory Acidosis");
		winterGreen_28_5();
		//aniongap();
	}
}
 if (PaCO2 > 35 && PaCO2 < 45) {
	if (pH < 7.35) {
		 printOutput(" Combined Metabolic Acidosis and Respiratory Alkalosis");
		winterGreen_28_3();
		//aniongap();
	}
	if (pH > 7.45) {
		 printOutput(" Combined Metabolic Alkalosis and Respiratory Acidosis");
		winterGreen_28_4();
	}
}
 if (pH < 7.35 && PaCO2 > 35) {
	 printOutput(" Primary Metabolic Acidosis");
	winterGreen_28_3();
	// aniongap();
}
 if (pH < 7.35 && PaCO2 > 45) {
	 printOutput(" Primary Respiratory Acidosis");
	winterGreen_28_5();
	// aniongap();
}
 if (pH > 7.45 && PaCO2 < 35) {
	 printOutput(" Primary Respiratory Alkalosis");
	winterGreen_28_6();
}
 if (pH > 7.45 && PaCO2 > 45) {
	 printOutput(" Primary metabolic alkalosis");
	winterGreen_28_4(HCO3, PaCO2);
}
// else {
// 	 printOutput("No logical acid base abnormality found");
// }

}

// function preliminaryCheckSC () {
// 	if (pH > 7.35 && pH < 7.45) {} else{};
// }


//wintergreen functions

function winterGreen_28_3() {
	window.expectedPaCO2 = ((1.5 * HCO3) + 0.8);
	if (PaCO2 < (expectedPaCO2 - 2)) {
		 printOutput(", With superimposed respiratory alkalosis");
	}
	if (PaCO2 > (expectedPaCO2 + 2) && PaCO2 < 45) {
		 printOutput(", Insufficient respiratory compensation");
	}
	if (PaCO2 > 45) {
		 printOutput(", With superimposed respiratory acidosis");
	}
	else {
		 printOutput(", Sufficient respiratory compensation");
	}
}
function winterGreen_28_4() {
	expectedPaCO2 = ((0.7 * HCO3) + 21);
	if (PaCO2 < (expectedPaCO2 - 2)) {
		printOutput(", With superimposed respiratory alkalosis");
	}
	if (PaCO2 > (expectedPaCO2 + 2)) {
		printOutput(", With superimposed respiratory acidosis");
	}
	else {
		 printOutput(", With fully compensated");
	}
}
function winterGreen_28_5() {
	window.lowerLimitExpectedpH = (7.40 - (0.008 * (PaCO2 - 40)));
	window.UpperLimitExpectedpH = (7.40 - (0.003 * (PaCO2 - 40)));
	if (pH < lowerLimitExpectedpH) {
		 printOutput(", Superimposed metabolic acidosis and no renal compensation");
	}
	if (pH >= lowerLimitExpectedpH && ph < UpperLimitExpectedpH) {
		 printOutput(", Insufficient renal compensation");
	}
	if (pH == UpperLimitExpectedpH) {
		 printOutput(", Sufficient renal compensation");
	}
	if (pH > UpperLimitExpectedpH) {
		 printOutput(", Superimposed metabolic alkalosis");
	}
}
function winterGreen_28_6() {
		UpperLimitExpectedpH = (7.40 + (0.008 * (40 - PaCO2)));
		lowerLimitExpectedpH = (7.40 - (0.008 * (40 - PaCO2)));
	if (pH < lowerLimitExpectedpH) {
		 printOutput(", Superimposed metabolic acidosis and no renal compensation");
	}
	if (pH >= lowerLimitExpectedpH && pH < UpperLimitExpectedpH) {
		 printOutput(", Insufficient renal compensation");
	}
	if (pH == UpperLimitExpectedpH) {
		 printOutput(", Sufficient renal compensation");
	}
	if (pH > UpperLimitExpectedpH) {
		 printOutput(", Respiratory alkalosis");
	}
}

function printOutput(message) {
	document.getElementById("message").innerHTML=document.getElementById("message").innerHTML+message;
	// document.getElementById("message").innerHTML=message;
	// document.write(message);
}