import { Component } from '@angular/core';

@Component({
  selector: 'app-insurance-form',
  templateUrl: './insurance-form.component.html',
  styleUrls: ['./insurance-form.component.scss']
})
export class InsuranceFormComponent {
  vehicleTypes = ['car', 'motorcycle'];
  selectedVehicleType!: string;
  isUnder25: boolean = false;
  penaltyPoints!: number;
  premiumToPay!: number;

  calculatePremium(): void {
    this.premiumToPay = 0;

    if (this.selectedVehicleType === 'car') {
      this.premiumToPay = 305;
    } else if (this.selectedVehicleType === 'motorcycle') {
      this.premiumToPay = 360;
    } else {
      alert('Invalid vehicle type. Please select "car" or "motorcycle".');
      return;
    }

    if (this.isUnder25) {
      this.premiumToPay += 0.3 * this.premiumToPay;
    }

    if (this.penaltyPoints > 6) {
      this.premiumToPay += 100;
    }

    alert(`Total premium payable: £${this.premiumToPay.toFixed(2)}`);
  }
}
