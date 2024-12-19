export function AutoAssign() {
  return function <T extends { new (...args: any[]): {} }>(constructor: T) {
    return class extends constructor {
      constructor(...args: any[]) {
        super();
        Object.assign(this, ...(args.length ? args : [{}]));
      }
    };
  };
}
