import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WishComponentComponent } from './wish-component.component';

describe('WishComponentComponent', () => {
  let component: WishComponentComponent;
  let fixture: ComponentFixture<WishComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WishComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WishComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
